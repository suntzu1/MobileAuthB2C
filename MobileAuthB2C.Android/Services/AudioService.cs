using System;
using Xamarin.Forms;
using Android.Media;
using Android.Content.Res;
using Gia.Droid.Services;
using Gia.Services;

[assembly: Dependency(typeof(AudioService))]
namespace Gia.Droid.Services
{
	public class AudioService : IAudio
	{
		public AudioService()
		{
		}

		public void PlayAudio()
		{
			var player = new MediaPlayer();
			var fd = global::Android.App.Application.Context.Assets.OpenFd("guitar.wav");
			player.Prepared += (s, e) =>
			{
				player.Start();
			};
			player.SetDataSource(fd.FileDescriptor, fd.StartOffset, fd.Length);
			player.Prepare();
		}

        public void StopAudio()
        {
            throw new NotImplementedException();
        }
    }
}